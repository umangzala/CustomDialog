package admin.mams.apex.customdialog;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow= (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Login");


        LayoutInflater layoutInflater=this.getLayoutInflater();
        View view1=layoutInflater.inflate(R.layout.custom,null);
        final EditText txtusername= (EditText) view1.findViewById(R.id.txtusername);
        final EditText txtpassword= (EditText) view1.findViewById(R.id.txtpassword);



        final Button btnLogin= (Button) view1.findViewById(R.id.btnLogin);
        final Button btnClose= (Button) view1.findViewById(R.id.btnClose);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Closed Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setView(view1);

        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }
}
