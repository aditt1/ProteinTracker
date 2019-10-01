package com.example.proteintracker;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MahasiswaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MahasiswaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MahasiswaFragment extends Fragment {
    public static String msgNim = "msg_nim";
    public static String msgNama = "msg_nama";

    EditText mEditText;
    Button mButton;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MahasiswaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MahasiswaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MahasiswaFragment newInstance(String param1, String param2) {
        MahasiswaFragment fragment = new MahasiswaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mahasiswa, container, false);
        mEditText = (EditText) view.findViewById(R.id.txtNim);
        mEditText = (EditText) view.findViewById(R.id.txtNama);
        mEditText = (EditText) view.findViewById(R.id.txtTempat);
        mEditText = (EditText) view.findViewById(R.id.txtTanggal);
        mEditText = (EditText) view.findViewById(R.id.txtAgama);
        mEditText = (EditText) view.findViewById(R.id.txtKelamin);
        mEditText = (EditText) view.findViewById(R.id.txtAlamat);
        mEditText = (EditText) view.findViewById(R.id.txtTelp);
        mButton = (Button) view.findViewById(R.id.btnSimpan);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = mEditText.getText().toString();
                MahasiswaFragment mahasiswa = new MahasiswaFragment();
                Bundle mBundle = new Bundle();
                mBundle.putString(msgNim, msg);
                mahasiswa.setArguments(mBundle);

                FragmentManager mFragmentManager = getFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction()
                        .replace(R.id.FrameLayout,mahasiswa,MahasiswaFragment.class.getSimpleName());
                mFragmentTransaction.addToBackStack(null).commit();

            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void SendData(View view);
    }
}
