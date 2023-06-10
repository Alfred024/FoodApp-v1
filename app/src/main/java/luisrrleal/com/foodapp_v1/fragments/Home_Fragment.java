package luisrrleal.com.foodapp_v1.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import luisrrleal.com.foodapp_v1.Adapter.Popular_food_adapter;
import luisrrleal.com.foodapp_v1.MainActivity;
import luisrrleal.com.foodapp_v1.R;
import java.util.ArrayList;
import luisrrleal.com.foodapp_v1.Data_classes.Popular_food;

//Creamos una clase Adapter que recopila los datos y los mete en el RecyclerView
//La clase ViewHolder será la que muestre la celdas de cada item del RecyclerView
public class Home_Fragment extends Fragment{
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView_food;
    ArrayList<Popular_food> cards = new ArrayList<>();
    MainActivity activity = new MainActivity();

    public Home_Fragment() {

    }
    public static Home_Fragment newInstance() {
        Home_Fragment fragment = new Home_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        fill_cards_info();
    }

    /*private void food_cards_Setup(){
        fill_cards_info();
        recyclerView_food = (RecyclerView)activity.findViewById(R.id.recyclerView_food_id);
        recyclerView_food.setLayoutManager();
        recyclerView_food.setAdapter(new Popular_food_adapter(cards));
    }*/

    public void fill_cards_info(){
        cards.add(new Popular_food(
                "Hot cakes",
                "3 Hot cakes hechos con huevo, leche, harina de trigo y mantequilla, " +
                        "servidos con miel de maple o mermelada de fresa.",
                "comida1.jpg",
                "50.00"
        ));

        cards.add(new Popular_food(
                "Caldo de caldo",
                "Un caldo de carne de res y jitomate con chile guajillo, con pedazitos " +
                        "de carne de res y trozos de papa. Servido con 3 tortillas y un vaso de agua de sabor",
                "comida2.jpg",
                "50.00"
        ));

        cards.add(new Popular_food(
                "Burritos de guiso",
                "Tres burritos de un guiso de preferencia.",
                "comida3.jpg",
                "60.00"
        ));

        cards.add(new Popular_food(
                "Burguir con papas",
                "Hamburguesa de care de res, servida con papas fritas en gajos y aompañadas de una " +
                        "bebida de sabor.",
                "comida4.jpg",
                "60.00"
        ));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_main,container,false);
        recyclerView_food = (RecyclerView)activity.findViewById(R.id.recyclerView_food_id);
        //recyclerView_food.setLayoutManager();
        recyclerView_food.setAdapter(new Popular_food_adapter(cards));

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}