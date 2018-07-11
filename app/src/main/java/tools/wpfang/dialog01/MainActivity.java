package tools.wpfang.dialog01;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAlert(View view) {
        AlertDialog.Builder myBuild=new AlertDialog.Builder(this);
        myBuild.setTitle("Exit");
        myBuild.setMessage("Are you sure?");
        myBuild.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        myBuild.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        myBuild.show();
    }

    public void doProgress(View view) {
        ProgressDialog pd=new ProgressDialog(this);
        pd.setTitle("Downloading");
        pd.setMessage("Please wait!!!");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        pd.show();
    }

    public void doProgress2(View view) {
        ProgressDialog pd=new ProgressDialog(this);
        pd.setTitle("Downloading");
        pd.setMessage("Please wait!!!");
        pd.setMax(200);
        pd.setProgress(100);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        pd.show();
    }
}
