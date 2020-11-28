package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swing.Shayarana.R
import com.swing.Shayarana.sadshayari


class myAdopter(val shayaridata: MutableList<sadshayari>): RecyclerView.Adapter<myAdopter.viewholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {

        val inflater =  LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.itemview,parent,false)
        return viewholder(view)

            }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.txtitle.text=  shayaridata[position].txttitel

    }

    override fun getItemCount(): Int {
        return shayaridata.size
    }



    class viewholder(itemView: View):RecyclerView.ViewHolder(itemView){


        var txtitle = itemView.findViewById<TextView>(R.id.txttitel)

    }

}



