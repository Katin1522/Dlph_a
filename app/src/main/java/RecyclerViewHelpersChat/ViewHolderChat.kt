package RecyclerViewHelpersChat

import android.R
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolderChat (view: View): RecyclerView.ViewHolder(view) {
    val txtMensaje = view.findViewById<TextView>(katherine.guillen.dlph_a.R.id.txtEscribirMens)
    val btnEnviar = view.findViewById<Button>(katherine.guillen.dlph_a.R.id.btnEnviarMens)


}