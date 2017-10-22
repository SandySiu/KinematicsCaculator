package comsandysiu.github.kinematicscaculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import java.math.BigDecimal;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent result = getIntent();

        String ini1 = result.getStringExtra("ini1");//获取控件对象
        TextView ini_r2 =(TextView)findViewById(R.id.ini_r2);//将文本框的内容设置为获取的Intent的内容
        ini_r2.setText(ini1 + " km/h");

        String ini2 = result.getStringExtra("ini2");
        TextView ini_r3 =(TextView)findViewById(R.id.ini_r3);
        BigDecimal ini2_bd = new BigDecimal(ini2);
        ini2_bd = ini2_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        ini_r3.setText(ini2_bd + " m/s");

        String final1 = result.getStringExtra("final1");
        TextView final_r2 =(TextView)findViewById(R.id.final_r2);
        final_r2.setText(final1 + " km/h");

        String final2 = result.getStringExtra("final2");
        TextView final_r3 =(TextView)findViewById(R.id.final_r3);
        BigDecimal final2_bd = new BigDecimal(final2);
        final2_bd = final2_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        final_r3.setText(final2_bd + " m/s");

        String a1 = result.getStringExtra("a1");
        TextView a_r2 =(TextView)findViewById(R.id.a_r2);
        a_r2.setText(a1 + " km/h/s");

        String a2 = result.getStringExtra("a2");
        TextView a_r3 =(TextView)findViewById(R.id.a_r3);
        BigDecimal a2_bd = new BigDecimal(a2);
        a2_bd = a2_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        a_r3.setText(a2_bd + " m/s/s");

        Double ini = new Double(ini2);
        double v0 = ini.doubleValue();

        Double finalv = new Double(final2);
        double v = finalv.doubleValue();

        Double acce = new  Double(a2);
        double a = acce.doubleValue();

        double x2 = (v*v - v0*v0)/(a*2);
        double x1 = x2/1000;
        TextView x_r2 =(TextView)findViewById(R.id.x_r2);
        BigDecimal x1_bd = new BigDecimal(x1);
        x1_bd = x1_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        x_r2.setText(x1_bd +" km");
        TextView x_r3 =(TextView)findViewById(R.id.x_r3);
        BigDecimal x2_bd = new BigDecimal(x2);
        x2_bd = x2_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        x_r3.setText(x2_bd +" m");




    }

}
