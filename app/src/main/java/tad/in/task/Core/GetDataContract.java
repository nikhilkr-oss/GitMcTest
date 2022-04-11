package tad.in.task.Core;

import android.content.Context;

import java.util.List;

import tad.in.task.model.Owner;
import tad.in.task.model.User;


public interface GetDataContract {
    interface View{
        void onGetDataSuccess(String message, List<User> list,List<Owner> OwnerList);
        void onGetDataFailure(String message);
    }
    interface Presenter{
        void getDataFromURL(Context context, String url);
    }
    interface Interactor{
        void initRetrofitCall(Context context, String url);

    }
    interface onGetDataListener{
        void onSuccess(String message, List<User> usrlist, List<Owner>ownerList);
        void onFailure(String message);
    }
}
