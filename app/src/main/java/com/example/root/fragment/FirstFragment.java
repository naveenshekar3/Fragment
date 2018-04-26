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
public class FirstFragment extends Fragment {


    private Button mChangeBtn;
    private MainActivity mMainActivity;
    private EditText mNameEt;
    private Button mSendBtn;
    private TextView mPhoneTv;
    private TextView mAddressTv;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        // Inflate the layout for this fragment
        mMainActivity=(MainActivity)getActivity();
        mChangeBtn=(Button)view.findViewById(R.id.chng_btn);
        mNameEt=(EditText)view.findViewById(R.id.name_et);
        mSendBtn=(Button)view.findViewById(R.id.send_btn);
        mPhoneTv=(TextView)view.findViewById(R.id.phone_tv);
        mAddressTv=(TextView)view.findViewById(R.id.address_tv);

        mSendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivity.send(mNameEt.getText().toString());
            }
        });

        mChangeBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
            public void onClick(View v) {

                mMainActivity.change();
            }
        });
        return view;
    }

    public void sendPhone(String s) {
        mPhoneTv.setText(mPhoneTv.getText().toString()+" : "+s);
    }

    public void sendAddress(String s) {
        mAddressTv.setText(mAddressTv.getText().toString()+" : "+s);
    }
}
