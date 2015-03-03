package com.google.alihassan.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Ali Hassan on 3/3/2015.
 */
public class SingleContactActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.list_item);

        TextView txtProduct = (TextView) findViewById(R.id.name);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("name");
        // displaying selected product name
        txtProduct.setText(product);

    }

}
