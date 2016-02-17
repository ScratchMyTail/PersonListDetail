package no.nord.personlistdetail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by christerhansen on 17.02.16.
 */
public class ListeAdapter extends ArrayAdapter<Person> {
    Context context;
    List<Person> personList;

    public ListeAdapter(Context context, int resourceId, List<Person> personList){
        super(context, resourceId, personList);
        this.context = context;
        this.personList = personList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(this.context);
            v = vi.inflate(R.layout.list_item, null);
        }

        Person person = personList.get(position);

        TextView text1 = (TextView)v.findViewById(R.id.text1);
        TextView text2 = (TextView)v.findViewById(R.id.text2);

        text1.setText(person.getFornavn());
        text2.setText(person.getEtternavn());

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PersonActivity.class);
                context.startActivity(intent);
            }
        });

        return v;
    }
}
