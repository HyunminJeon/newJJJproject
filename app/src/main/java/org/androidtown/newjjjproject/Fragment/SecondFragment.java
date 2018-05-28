package org.androidtown.newjjjproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.androidtown.newjjjproject.Adapter.RecyclerAdapter;
import org.androidtown.newjjjproject.BoardItem;
import org.androidtown.newjjjproject.R;

import java.util.ArrayList;

public class SecondFragment extends android.support.v4.app.Fragment{


    RecyclerAdapter adapter;

    EditText edit_modelName;
    Button btn_search;
    RecyclerView recyclerView;



    public SecondFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //activity_first_fragment 를 인플레이트해 (엑티비티가 아님)
        View view = inflater.inflate(R.layout.activity_second_fragment, container, false);


        ArrayList<BoardItem> item = new ArrayList<>();

        edit_modelName = view.findViewById(R.id.edit_modelName);
        btn_search = view.findViewById(R.id.btn_search);
        recyclerView = view.findViewById(R.id.recycler_board);
        adapter = new RecyclerAdapter(getActivity(), item);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return view;
    }

}
