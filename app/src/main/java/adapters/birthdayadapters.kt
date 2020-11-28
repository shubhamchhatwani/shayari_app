package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swing.Shayarana.R
import com.swing.Shayarana.birthdayshayari

class birthdayadapters(val shayaridata:List<birthdayshayari>):
    RecyclerView.Adapter<birthdayadapters.birthdayholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): birthdayholder {

        val inflater =  LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.itemview,parent,false)
        return birthdayholder(view)
    }

    override fun onBindViewHolder(holder: birthdayholder, position: Int) {

        holder.txtitle.text=  shayaridata[position].txttitel

    }

    override fun getItemCount(): Int {
        return shayaridata.size
    }



    class birthdayholder(itemView: View):RecyclerView.ViewHolder(itemView){

        var txtitle = itemView.findViewById<TextView>(R.id.txttitel)


    }


}