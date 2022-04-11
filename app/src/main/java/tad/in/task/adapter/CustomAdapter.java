package tad.in.task.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import tad.in.task.DetailActivity;
import tad.in.task.R;
import tad.in.task.model.Owner;
import tad.in.task.model.User;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<User> userList = new ArrayList<>();
    List<Owner> OwnerList = new ArrayList<>();
    private Context context;

    public CustomAdapter(Context applicationContext, List<User> userList, List<Owner> ownerList, Context context) {
        this.userList = userList;
        this.OwnerList = ownerList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvTitle.setText(userList.get(position).getFullName());
//        holder.tvId.setText(userList.get(position).getId()+"");
        holder.tvBody.setText(userList.get(position).getDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                String name = userList.get(position).getName();
                String desc=userList.get(position).getDescription();
                String forkUrl=userList.get(position).getForksUrl();
                String teams_url=userList.get(position).getTeamsUrl();


                intent.putExtra("name",name);
                intent.putExtra("desc",desc);
                intent.putExtra("teams_url",teams_url);
                intent.putExtra("forkUrl",forkUrl);

                context.startActivity(intent);
            }
        });

        RequestOptions options = new RequestOptions()
                .centerCrop()

                .error(R.drawable.ic_launcher_background)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH);

        Glide.with(context)
                .applyDefaultRequestOptions(options)
                .load(OwnerList.get(position).getAvatarUrl())
                .into(holder.ImageVw);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvBody;
        CircleImageView ImageVw;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            ImageVw = (CircleImageView) itemView.findViewById(R.id.imageView);
            tvTitle = (TextView) itemView.findViewById(R.id.user_title);
            tvBody = (TextView) itemView.findViewById(R.id.user_body);
        }
    }

}
