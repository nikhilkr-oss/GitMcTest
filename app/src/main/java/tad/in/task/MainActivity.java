package tad.in.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import tad.in.task.Core.GetDataContract;
import tad.in.task.Core.Presenter;
import tad.in.task.adapter.CustomAdapter;
import tad.in.task.model.Owner;
import tad.in.task.model.User;
import tad.in.task.utils.LoaderDialog;

public class MainActivity extends AppCompatActivity
        implements GetDataContract.View {
    private LoaderDialog loaderDialog;

    private Presenter mPresenter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new Presenter(this);

        loaderDialog = new LoaderDialog(this);
        loaderDialog.show();
        mPresenter.getDataFromURL(getApplicationContext(), "");
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


    @Override
    public void onGetDataSuccess(String message, List<User> Usrlist, List<Owner> OwnerList) {


        customAdapter = new CustomAdapter(getApplicationContext(), Usrlist,OwnerList,this);
        recyclerView.setAdapter(customAdapter);
        if (loaderDialog != null && loaderDialog.isShowing()) {
            loaderDialog.dismiss();
            loaderDialog = null;
        }
    }

    @Override
    public void onGetDataFailure(String message) {
        if (loaderDialog != null && loaderDialog.isShowing()) {
            loaderDialog.dismiss();
            loaderDialog = null;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}