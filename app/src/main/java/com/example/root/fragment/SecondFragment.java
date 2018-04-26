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
public class SecondFragment extends Fragment {


    private TextView mNameTv;
    private EditText mPhoneEt;
    private MainActivity mMainActivity;
    private Button mSendPhoneBtn;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        mNameTv=(TextView)view.findViewById(R.id.name_tv);
        mPhoneEt=(EditText)view.findViewById(R.id.phone_et);
        mMainActivity=(MainActivity)getActivity();
        mSendPhoneBtn=(Button)view.findViewById(R.id.sendphone_btn);

        mSendPhoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivity.sendPhone(mPhoneEt.getText().toString());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    public void send(String s) {
        mNameTv.setText(s);

    }

    public void sendAddress(String s) {
        mNameTv.setText(s);
    }
}
