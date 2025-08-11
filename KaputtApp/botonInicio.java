public class MainActivity extends AppCompatActivity {

    FrameLayout frameInicio, frameGastos;
    Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameInicio = findViewById(R.id.frameInicio);
        frameGastos = findViewById(R.id.frameGastos);
        btnInicio = findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameInicio.setVisibility(View.VISIBLE);
                frameGastos.setVisibility(View.GONE);
            }
        });
    }
}
