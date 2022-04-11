package tad.in.task.Core;

import android.content.Context;

import java.util.List;

import tad.in.task.MainActivity;
import tad.in.task.model.Owner;
import tad.in.task.model.User;


public class Presenter implements GetDataContract.Presenter, GetDataContract.onGetDataListener {
    private GetDataContract.View mGetDataView;
    private Intractor mIntractor;
    public Presenter(MainActivity mGetDataView){
        this.mGetDataView = mGetDataView;
        mIntractor = new Intractor(this);
    }
    @Override
    public void getDataFromURL(Context context, String url) {
        mIntractor.initRetrofitCall(context,url);
    }


    @Override
    public void onSuccess(String message, List<User> usrdata, List<Owner>OwnerList) {
        mGetDataView.onGetDataSuccess(message, usrdata,OwnerList);
    }

    @Override
    public void onFailure(String message) {
        mGetDataView.onGetDataFailure(message);
    }
}
