package com.example.zyz.helloword;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class HellowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellow);

        final EditText editText = (EditText) findViewById(R.id.edit_text);

        final ImageView imageView = (ImageView) findViewById(R.id.image_view);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView.setImageResource(R.mipmap.img_02);
                int progress = progressBar.getProgress();
                progress ++;
                progressBar.setProgress(progress);
                AlertDialog.Builder dialog = new AlertDialog.Builder(HellowActivity.this);
                dialog.setTitle("么么哒");
                dialog.setMessage("小宝贝，我爱你，嫁给我");
                dialog.setCancelable(false);
                dialog.setPositiveButton("好", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(HellowActivity.this,"我爱你",Toast.LENGTH_LONG).show();
                    }
                });
                dialog.setNegativeButton("我愿意", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(HellowActivity.this,"咱们结婚吧",Toast.LENGTH_LONG).show();
                    }
                });
                dialog.show();
            }
        });


    }
}
