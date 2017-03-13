package com.example.zyz.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Log.d(TAG, "onCreate: wocaonima ===============================");
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "老婆，我知道错了。",Toast.LENGTH_LONG).show();
//                finish();
                Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
//                Intent intent = new Intent("com.example.zyz.activitytest.ACTION_START");
//                intent.addCategory("com.example.zyz.activitytest.MY_CATEGORY");
                //打开网页
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
                //调用系统拨号
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:13585111205"));
//                String data = "我喜欢 二爽";
//                intent.putExtra("extra_data", data);
//                startActivity(intent);
//                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you click add", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you click remove", Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (requestCode == RESULT_OK){
                    String resultData = data.getStringExtra("data_return");
                    Log.d(TAG, "onActivityResult: " + resultData);
                }
                break;
            default:
        }
    }
}
