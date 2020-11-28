package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swing.Shayarana.R
import com.swing.Shayarana.loveshayari

class loveadapter(val shayaridata:List<loveshayari>):RecyclerView.Adapter<loveadapter.loveholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): loveholder {
        val inflater =  LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.itemview,parent,false)
        return loveholder(view)
    }

    override fun onBindViewHolder(holder: loveholder, position: Int) {
        holder.txtitle.text=  shayaridata[position].txttitel
    }

    override fun getItemCount(): Int {
        return shayaridata.size
    }




    class loveholder(itemView: View):RecyclerView.ViewHolder(itemView){
        var txtitle = itemView.findViewById<TextView>(R.id.txttitel)}





}