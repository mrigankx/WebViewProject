package com.example.webviewproject

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var webData = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table, th, td {\n" +
            "  border:1px solid black;\n" +
            "}\n" +
            "</style>\n" +
            "<body>\n" +
            "\n" +
            "<h2>A basic HTML table</h2>\n" +
            "\n" +
            "<table style=\"width:100%\">\n" +
            "  <tr>\n" +
            "    <th>Company</th>\n" +
            "    <th>Contact</th>\n" +
            "    <th>Country</th>\n" +
            "  </tr>\n" +
            "  <tr>\n" +
            "    <td>Alfreds Futterkiste</td>\n" +
            "    <td>Maria Anders</td>\n" +
            "    <td>Germany</td>\n" +
            "  </tr>\n" +
            "  <tr>\n" +
            "    <td>Centro comercial Moctezuma</td>\n" +
            "    <td>Francisco Chang</td>\n" +
            "    <td>Mexico</td>\n" +
            "  </tr>\n" +
            "</table>\n" +
            "\n" +
            "<p>To undestand the example better, we have added borders to the table.</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n" +
            "\n";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadData(webData, "text/html", "UTF-8")
    }

}