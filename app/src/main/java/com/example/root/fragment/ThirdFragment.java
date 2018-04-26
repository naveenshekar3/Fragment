package com.example.root.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    private TextView mNameTv;
    private EditText address_et;
    private Button address_btn;
    private MainActivity mMainActivity;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_third, container, false);
        mMainActivity=(MainActivity)getActivity();
         mNameTv=(TextView)view.findViewById(R.id.mName);
        address_et=(EditText)view.findViewById(R.id.address_et);
        address_btn=(Button)view.findViewById(R.id.address_btn);
        address_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivity.sendAddress(address_et.getText().toString());
            }
        });

        return view;
    }

    public void send(String s) {
        mNameTv.setText(s);
    }

    public void sendAddress(String s) {
        mNameTv.setText(s);
    }
}
