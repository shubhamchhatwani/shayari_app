package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swing.Shayarana.R
import com.swing.Shayarana.teashayari

class teaadapter(val shayaridata:List<teashayari>):RecyclerView.Adapter<teaadapter.teaholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): teaholder {
        val inflater =  LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.itemview,parent,false)
        return teaholder(view)
    }

    override fun onBindViewHolder(holder: teaholder, position: Int) {

        holder.txtitle.text=  shayaridata[position].txttitel



    }

    override fun getItemCount(): Int {
        return shayaridata.size
    }





    class teaholder(itemView: View):RecyclerView.ViewHolder(itemView){
        var txtitle = itemView.findViewById<TextView>(R.id.txttitel)



    }


}