package luisrrleal.com.foodapp_v1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import luisrrleal.com.foodapp_v1.Data_classes.Popular_food;
import luisrrleal.com.foodapp_v1.R;

public class Popular_food_adapter extends RecyclerView.Adapter<Popular_food_viewholder>{
    //private ArrayList<Popular_food>  popular_food_data;
    ArrayList<Popular_food>  popular_food_data;
    public Popular_food_adapter(ArrayList<Popular_food>  popular_food_data) {
        this.popular_food_data = popular_food_data;
    }

    //Este método nos va a retornar el Layout de ese item que mostraremos
    @NonNull
    @Override
    public Popular_food_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layout_food_card = LayoutInflater.from(parent.getContext());
        Popular_food_viewholder res_layout;
        res_layout  = new Popular_food_viewholder(layout_food_card.inflate(R.layout.food_info_layout, parent, false));
        return res_layout;
    }

    @Override
    public void onBindViewHolder(@NonNull Popular_food_viewholder holder, int position) {
        holder.render_card(popular_food_data.get(position));
    }

    @Override
    public int getItemCount() {
        return popular_food_data.size();
    }
}
