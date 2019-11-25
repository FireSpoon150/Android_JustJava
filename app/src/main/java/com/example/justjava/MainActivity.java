package com.example.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Integer quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showQuantity() {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.format(Locale.getDefault(), "%d", quantity));
    }

    public void buttonDec(View view) {
        if (quantity > 0) {
            --quantity;
        }
        showQuantity();
    }

    public void buttonInc(View view) {
        if (quantity < 100) {
            ++quantity;
        }
        showQuantity();
    }

    private int getTotalPrice(boolean whippedCream, boolean chocolate) {
        PriceBean price = new PriceBean(7, 3, 2);

        int unitPrice = price.getCoffeePrice();
        if (whippedCream) {
            unitPrice += price.getWhippedCreamPrice();
        }
        if (chocolate) {
            unitPrice += price.getChocolatePrice();
        }

        return quantity * unitPrice;
    }

    public void buttonOrder(View view) {
        EditText nameTextView = findViewById(R.id.name_edit_text_view);
        String name = nameTextView.getText().toString();

        CheckBox whippedCreamCheckBox = findViewById(R.id.whipped_cream_check_box);
        boolean whippedCream = whippedCreamCheckBox.isChecked();

        CheckBox chocolateCheckBox = findViewById(R.id.chocolate_check_box);
        boolean chocolate = chocolateCheckBox.isChecked();

        int totalPrice = getTotalPrice(whippedCream, chocolate);

        OrderBean order = new OrderBean(name, quantity, whippedCream, chocolate, totalPrice);

        /*
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(order.toString());
         */

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, String.format(Locale.getDefault(),
                "JustJava order for %s", name));
        intent.putExtra(Intent.EXTRA_TEXT, order.toString());
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
