package tad.in.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView HeadingTv,DescTv,UrlTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

 HeadingTv=findViewById(R.id.text_head);
        DescTv=findViewById(R.id.text_desc);
        UrlTv=findViewById(R.id.Url);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String desc=intent.getStringExtra("desc");
        String forkUrl=intent.getStringExtra("forkUrl");
        String teamUrl=intent.getStringExtra("teams_url");


        HeadingTv.setText(name);
        DescTv.setText(desc);
        UrlTv.setText("ForkUrL : "+forkUrl +"\n"+

        "TeamUrl : "+teamUrl);

    }
}