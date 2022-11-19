package com.example.app_supportpolywork.view.main_activity.job;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.app_supportpolywork.data.dummy.JobDummy;
import com.example.app_supportpolywork.data.model.Job;
import com.example.app_supportpolywork.databinding.FragmentJobBinding;


public class JobFragment extends Fragment implements JobAdapter.JobAdapterListener {

    private FragmentJobBinding mBinding;
    private JobAdapter mJobAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentJobBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupJobs();
    }

    private void setupJobs() {
        mJobAdapter = new JobAdapter(this);
        mBinding.rcvJobs.setAdapter(mJobAdapter);
        mJobAdapter.submitList(JobDummy.getJobList());
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onClickJobItem(Job job) {

    }
}