package com.example.user.hanzip.Main;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.user.hanzip.R;
import com.example.user.hanzip.network.ApiValue;
import com.example.user.hanzip.network.response.MainResult;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MainListAdapter mainListAdapter;
    SharedPreferences mPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        mainListAdapter = new MainListAdapter(getApplicationContext());
        recyclerView.setAdapter(mainListAdapter);
        show_mainList();

           }

    public void show_mainList(){
        MainListAsyncTask requestTask = new MainListAsyncTask(new MainListAsyncTask.MainListAsyncTaskHandler() {
            @Override
            public void onSuccessAppAsyncTask(MainResult result) {
                if(result.success && result.mainHomeinfo.size()>0) {
                    mainListAdapter.setImgData(result.mainHomeinfo);
                    mainListAdapter.notifyDataSetChanged();
                    recyclerView.setVisibility(View.VISIBLE);
                    mainListAdapter.notifyDataSetChanged();
                }
                else{
                    Toast.makeText(getApplicationContext(), "서버 통신에 실패하였습니다.", Toast.LENGTH_LONG);
                }
            }

            @Override
            public void onFailAppAsysncask() {
                Toast.makeText(getApplicationContext(), "서버 통신에 실패하였습니다.", Toast.LENGTH_LONG);
            }

            @Override
            public void onCancelAppAsyncTask() {
                Toast.makeText(getApplicationContext(), "사용자가 해당 작업을 중지하였습니다.", Toast.LENGTH_LONG);
            }

        });


        //requestTask.execute(ApiValue.API_MYPAGE_IMG+real_user_id);
    }


}
