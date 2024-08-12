import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentsample.R

class MenuThanksFragment : Fragment(R.layout.fragment_menu_thanks) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuName = arguments?.getString("menuName") ?: ""
        val menuPrice = arguments?.getString("menuPrice") ?: ""

        val tvMenuName = view.findViewById<TextView>(R.id.tvMenuName)
        val tvMenuPrice = view.findViewById<TextView>(R.id.tvMenuPrice)

        tvMenuName.text = menuName
        tvMenuPrice.text = menuPrice

        val btBackButton = view.findViewById<Button>(R.id.btThxBack)
        btBackButton.setOnClickListener(ButtonClickListener())
    }

    private inner class ButtonClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            parentFragmentManager.popBackStack()
        }
    }
}