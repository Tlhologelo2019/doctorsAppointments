package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Kgothatso Moroka", "Raslouw Private Hospital", "Experience: 7 years", "kgothatso.moroka@gmail.com ", "060 6733 903", "300"},
                    {"Doctor Bonolo Mabunda", "Pholoso, Polokwane", "Experience: 9 years", "bonolo.mabunda@gmail.com", "067 3390 063", "340"},
                    {"Doctor Thabiso Sekwati", "Dilokong, Burgersfort", "Experience: 3 years", "thabiso.sekwati@gmail.com", "072 9444 723", "350"},
                    {"Doctor Name: David Makgotla", "Mankweng, Turfloop", "Experience: 4 years", "david.makgotla@gmail.com", "083 6100 944", "342"},
                    {"Doctor Name: LeThabo Moshoana", "Netcare Waterfall City Hospital", "Experience: 11 years", "lethabo.moshoana@gmail.com ", "071 2513 211", "450"}
//                    {"Doctor Name: Molemo Maphori", "Hospital Address: Netcare Unitas Hospital", "Experience: 6 years", "Email: omolemo.maphori@gmail.com", "Phone no: 081 5557 234"},
//                    {"Doctor Name: Elizabeth Thubakgale", "Hospital Address: Mankweng, Turfloof", "Experience: 15 years", "Email: elizabeth.thubakgale@gmail.com", "Phone no: 060 6733 902"}
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Kamogelo Moroka", "Raslouw Private Hospital", "Experience: 7 years", "kamogelo.moroka@gmail.com ", "060 6733 815", "450"},
                    {"Doctor Mohau Mabunda", "Pholoso, Polokwane", "Experience: 2 years", "bonolo.mabunda@gmail.com", "067 6198 063", "390"},
                    {"Doctor Johannes Mike", "Dilokong, Burgersfort", "Experience: 3 years", "johanne.mike@gmail.com", "072 7554 723", "380"},
                    {"Doctor David Smith", "Mankweng, Turfloop", "Experience: 6 years", "david.smith@gmail.com", "083 6100 754", "370"},
                    {"Doctor Samuel James", "Netcare Waterfall City Hospital", "Experience: 10 years", "samuel.james@gmail.com ", "071 0303 691", "560"}
//                    {"Doctor Name: Masefako Maphori", "Hospital Address: Netcare Unitas Hospital", "Experience: 5 years", "Email: masefako.maphori@gmail.com", "Phone no: 081 4232 324"},
//                    {"Doctor Name: Anele Maditsela", "Hospital Address: Mankweng, Turfloof", "Experience: 4 years", "Email: anele.maditsela@gmail.com", "Phone no: 073 5443 746"}
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Jonathan Vegan", "Raslouw Private Hospital", "Experience: 4 years", "jonathan.vegan@gmail.com ", "078 4546 253", "460"},
                    {"Doctor James Bond", "Pholoso, Polokwane", "Experience: 3 years", "james.bond@gmail.com", "079 9856 657", "530"},
                    {"Doctor Karabo Sefako", "Dilokong, Burgersfort", "Experience: 6 years", "karabo.sefako@gmail.com", "Phone no: 074 2635 980", "456"},
                    {"Doctor Mandla Maputla", "Mankweng, Turfloop", "Experience: 2 years", "mandla.maputla@gmail.com", "Phone no: 076 5644 386", "340"},
                    {"Doctor Lehlogonolo Moshoana", "Netcare Waterfall City Hospital", "Experience: 6 years", "lehlogonolo.moshoana@gmail.com ", "Phone no: 071 2513 435", "340"}
//                    {"Doctor Name: Lesedi Maphori", "Hospital Address: Netcare Unitas Hospital", "Experience: 6 years", "Email: lesedi.maphori@gmail.com", "Phone no: 081 5557 867"},
//                    {"Doctor Name: Julian Thubakgale", "Hospital Address: Mankweng, Turfloof", "Experience: 15 years", "Email: julian.thubakgale@gmail.com", "Phone no: 060 6733 547"}
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Dineo Masego", "Raslouw Private Hospital", "Experience: 8 years", "dineo.masego@gmail.com ", "075 4654 768", "410"},
                    {"Doctor Cristiano Ronaldo", "Pholoso, Polokwane", "Experience: 5 years", "cristiano.ronaldo@gmail.com", "079 6576 879 ", "370"},
                    {"Doctor Camavinga Edouard", "Dilokong, Burgersfort", "Experience: 7 years", "camavinga.edouard@gmail.com", "073 5546 576", "350"},
                    {"Doctor Kevin De Bruyne", "Mankweng, Turfloop", "Experience: 3 years", "kevin.debruyne@gmail.com", "076 5644 386", "450"},
                    {"Doctor Julian Alveraz", "Netcare Waterfall City Hospital", "Experience: 3 years", "julian.alveraz@gmail.com ", "071 0978 879", "400"}
//                    {"Doctor Name: Phil Foden", "Hospital Address: Netcare Unitas Hospital", "Experience: 6 years", "Email: phil.foden@gmail.com", "Phone no: 081 8774 755"},
//                    {"Doctor Name: Nongolo Kante", "Hospital Address: Mankweng, Turfloof", "Experience: 8 years", "Email: nongolo.kante@gmail.com", "Phone no: 065 8747 238"}
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor ThembiNkosi Louch", "Raslouw Private Hospital", "Experience: 9 years", "thembiNkosi.louch@gmail.com ", "078 4546 253", "450"},
                    {"Doctor James Smith", "Pholoso, Polokwane", "Experience: 7 years", "james.smith@gmail.com", "079 4760 766", "430"},
                    {"Doctor John Wick", "Dilokong, Burgersfort", "Experience: 3 years", "john.wick@gmail.com", "073 7458 487", "427"},
                    {"Doctor Donald Nkosinathi", "Mankweng, Turfloop", "Experience: 5 years", "donald.nkosinathi@gmail.com", "084 4677 879", "480"},
                    {"Doctor Lehlogonolo Majoro", "Netcare Waterfall City Hospital", "Experience: 10 years", "lehlogonolo.majoro@gmail.com ", "Phone no: 070 4346 474", "410"}
//                    {"Doctor Name: Jacob Mothubatse", "Hospital Address: Netcare Unitas Hospital", "Experience: 8 years", "Email: jocob.motubatse@gmail.com", "Phone no: 080 3768 467"},
//                    {"Doctor Name: Tlhologelo Nkata", "Hospital Address: Mankweng, Turfloof", "Experience: 19 years", "Email: tlhologelo.nkata@gmail.com", "Phone no: 060 6722 802"}
            };



    TextView tv;
    Button btn;

    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textView_logo6);
        btn =findViewById(R.id.buttonLTDAddToCart);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietitian")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivities(new Intent[]{new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class)});

            }
        });

        list = new ArrayList();
        for (int i=0; i<doctor_details.length; i++){
            item = new HashMap<String,String>();

            item.put("line1", doctor_details[i][0]);
            item.put("line2", "Hospital Address: " +doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", "Email: " +doctor_details[i][3]);
            item.put("line5", "Phone no:  " +doctor_details[i][4]);
            item.put("line6", "Cons Fees: R" +doctor_details[i][5]);
            list.add(item);
        }

        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3", "line4", "line5", "line6"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e} // R.id.line_f}
                );
        ListView lst = findViewById(R.id.listViewLT);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                startActivities(new Intent[]{new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class)});
                Intent it = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][4]);
                it.putExtra("text5", doctor_details[i][5]);
                startActivity(it);
            }
        });
    }
}