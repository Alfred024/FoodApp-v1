package luisrrleal.com.foodapp_v1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import luisrrleal.com.foodapp_v1.Domain.Sections;
import luisrrleal.com.foodapp_v1.R;

public class Sections_adapter extends RecyclerView.Adapter<Sections_viewholder> {

    Context context;
    ArrayList<Sections> sectionsCards;

    public Sections_adapter(ArrayList<Sections> sectionsCards) {
        this.sectionsCards = sectionsCards;
    }

    @NonNull
    @Override
    public Sections_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        //System.out.println("Info of context: "+li);
        System.out.println("Class: "+li.getContext().getClass().getName());
        Sections_viewholder res_layout;
        res_layout  = new Sections_viewholder(li.inflate(R.layout.section_item, parent, false));
        return res_layout;
    }

    @Override
    public void onBindViewHolder(@NonNull Sections_viewholder holder, int position) {
        //RecyclerView recyclerView_food = getItemId(R.id.popular_food_container);
        //recyclerView_food.setAlpha(0);

        holder.renderSection(sectionsCards.get(position));
        holder.section_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Esconder", Toast.LENGTH_SHORT).show();
                //ConstraintLayout cl = v.findViewById(R.id.popular_food_container);
                //cl.setVisibility(View.INVISIBLE);
                //cl.setAlpha(0);
                //TextView tv = v.findViewById(R.id.textView4);
                //tv.setVisibility(View.INVISIBLE);

            }
        });
    }

    @Override
    public int getItemCount() {
        return sectionsCards.size();
    }
}
