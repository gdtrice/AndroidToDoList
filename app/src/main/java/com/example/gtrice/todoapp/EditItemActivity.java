package com.example.gtrice.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etModifyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etModifyText = (EditText) findViewById(R.id.etModifyText);
        etModifyText.setText(getIntent().getStringExtra("text"));
    }

    public void onSaveItem(View view) {
        Intent i = new Intent();
        i.putExtra("updatedText", etModifyText.getText().toString());
        i.putExtra("updatedPosition", getIntent().getIntExtra("position", -1));
        setResult(200, i);
        finish();
    }
}
