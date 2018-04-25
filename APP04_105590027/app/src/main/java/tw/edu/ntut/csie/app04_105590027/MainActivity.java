package tw.edu.ntut.csie.app04_105590027;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private TextView mResultTxt;
    private Button clearBtn;
    public String result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.StudentList);
        mResultTxt=(TextView)findViewById(R.id.resultTxt);
        clearBtn=(Button)findViewById(R.id.clearBtnn);

        result=" ";
        String[] str = {"學生1","學生2","學生3","學生4","學生5","學生6","學生7","學生8"};
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,str);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                    result += "學生";

                if(pos==0){
                    result +="1 ";
                }else if(pos==1){
                    result +="2 ";
                }else if(pos==2){
                    result +="3 ";
                }else if(pos==3){
                    result +="4 ";
                }else if(pos==4){
                    result +="5 ";
                }else if(pos==5){
                    result +="6 ";
                }else if(pos==6){
                    result +="7 ";
                }else if(pos==7){
                    result +="8 ";
                }
                mResultTxt.setText(result);
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result=" ";
                mResultTxt.setText(result);
            }
        });

    }

}
