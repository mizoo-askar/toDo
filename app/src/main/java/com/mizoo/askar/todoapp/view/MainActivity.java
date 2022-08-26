package com.mizoo.askar.todoapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mizoo.askar.todoapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}