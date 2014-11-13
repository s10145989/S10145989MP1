package edu.np.ece.mapg.s10145989mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	int myNumber = 9;
	EditText etMessage;
	TextView tvMessage;
	Button btGuess;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etMessage = (EditText) this.findViewById(R.id.etNumber);
		tvMessage = (TextView) this.findViewById(R.id.tvMessage);
		btGuess = (Button) this.findViewById(R.id.btGuess);
		btGuess.setOnClickListener(listener);

	}

	private View.OnClickListener listener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			String Message = etMessage.getText().toString();
			int num =	Integer.parseInt(Message);
			if(num == myNumber)
				Message = "Bingo! Correct Number.";
			else
				Message = "Wrong Number!";
			Toast.makeText(getBaseContext(), 
					Message, Toast.LENGTH_LONG).show();
		}
		};
		// TODO Auto-generated method stub
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	};


