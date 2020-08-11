package sg.edu.rp.c346.id18016553.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etURL = findViewById(R.id.editTextURL);

        wvMyPage.setWebViewClient(new WebViewClient());
        // WebView enable JavaScript execution
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        // Disable file access within WebView
        wvMyPage.getSettings().setAllowFileAccess(false);
        // Enable built-in zoom control for the WebView
        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // https://www.grab.com/sg/
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);

            }
        });

    }
}
