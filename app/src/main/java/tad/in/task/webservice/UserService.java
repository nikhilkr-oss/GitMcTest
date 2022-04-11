package tad.in.task.webservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;
import tad.in.task.model.User;

public interface UserService {


    @GET("/repositories")
    Call<List<User>> getUsers();

}
