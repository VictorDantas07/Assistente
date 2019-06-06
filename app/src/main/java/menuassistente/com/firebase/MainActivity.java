package menuassistente.com.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button e, p, m;
    private TextView emerg1, emeger2, mech1, mech2, pesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView emerg1 = findViewById(R.id.Emer);
        TextView emerg2 = findViewById(R.id.emerparen);
        TextView mech1 = findViewById(R.id.Mech);
        TextView mech2 = findViewById(R.id.mechparen);
        TextView pesquisa = findViewById(R.id.Pesq);

        setContentView(R.layout.activity_main);
        e = findViewById(R.id.btnEme);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
        p = findViewById(R.id.btnPes);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
        m = findViewById(R.id.btnMec);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
}
