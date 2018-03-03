/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 */

package com.example.android.justjava


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView


/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var items:Int=0
    /**
     * This method is called when the order button is clicked.
     */
    fun decrement(view: View)
    {
        items--
        display(items)
    }
    fun increment(view:View)
    {
        items++
        display(items)
    }
    fun submitOrder(view: View) {

        display(items)
        displayPrice(items*10)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    /**
     * This method displays the given price on the screen.
     */

    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        var a:EditText = findViewById<View>(R.id.name) as EditText
        var b:CheckBox = findViewById<View>(R.id.whipcream) as CheckBox
        var whip:Int=0
        var number2:Int=0
        if(b.isChecked)
        {
            number2=number+5
            whip++
        }
        else
        {
            number2=number
        }
        var whipstring:String="No"
        if(whip==1)
        {
            whipstring="Yes"
        }
        var naam=a.getText()
        var s:String="Name: $naam"+"\nQuantity: $items Coffe\nwhipCream: $whipstring"+"\nTotal:Rs $number2 \nThankyou"
        priceTextView.text=s
    }

    private fun display(num: Int) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + num
    }
}