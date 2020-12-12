package com.example.text5.Khoangthu;


import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text5.Dao.ThuchiDao;
import com.example.text5.Model.Thuchi;
import com.example.text5.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class loaithuFragment extends Fragment {

    FloatingActionButton mFloatingActionButton;
    RecyclerView mRecyclerView;
    ArrayList<Thuchi> mList;
    ThuchiDao mThuchiDao;


    public loaithuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_loaithu, container, false);

        mFloatingActionButton = view.findViewById(R.id.floatingbutton);
        mRecyclerView = view.findViewById(R.id.recyclerview);
        mThuchiDao = new ThuchiDao(getActivity());

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createdialog();
            }
        });

        mList = new ArrayList<>();
        mList = mThuchiDao.showthu();

        LinearLayoutManager
                mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        LoaithuAdapter adapter = new LoaithuAdapter(getActivity(), mList);
        mRecyclerView.setAdapter(adapter);

        return view;
    }

    private void createdialog(){
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();

        final EditText edtname = dialog.findViewById(R.id.edtname);
        TextView tvhuy = dialog.findViewById(R.id.tvhuy);
        TextView tvthem = dialog.findViewById(R.id.tvthem);

        tvhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        tvthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtname.getText().toString();
                Toast.makeText(getActivity(),name, Toast.LENGTH_SHORT).show();
                Thuchi thuchi = new Thuchi(name, "thu");
                mThuchiDao.addthuchi(thuchi);
            }
        });
    }

}
