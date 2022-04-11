package tad.in.task.Core;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tad.in.task.model.Owner;
import tad.in.task.model.User;
import tad.in.task.webservice.UserService;


public class Intractor implements GetDataContract.Interactor{
    private GetDataContract.onGetDataListener mOnGetDatalistener;
    List<User> user = new ArrayList<>();
    List<Owner> Owners = new ArrayList<>();

    public Intractor(GetDataContract.onGetDataListener mOnGetDatalistener){
        this.mOnGetDatalistener = mOnGetDatalistener;
    }
    @Override
    public void initRetrofitCall(Context context, String url) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        UserService request = retrofit.create(UserService.class);
        retrofit2.Call<List<User>> call = request.getUsers();
        call.enqueue(new retrofit2.Callback<List<User>>() {
            @Override
            public void onResponse(retrofit2.Call<List<User>> call, retrofit2.Response<List<User>> response) {
               List<User> userList = response.body();


                for(int i=0;i<userList.size();i++){
                    Owners.add(userList.get(i).getOwner());
                }
                Log.d("Data", "Refreshed");
                mOnGetDatalistener.onSuccess("List Size: " + userList.size(), userList,Owners);



            }
            @Override
            public void onFailure(retrofit2.Call<List<User>> call, Throwable t) {
                Log.v("Error",t.getMessage());
                mOnGetDatalistener.onFailure(t.getMessage());
            }
        });
    }
}
