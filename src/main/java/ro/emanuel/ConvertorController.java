package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertorController {

    @GetMapping("/convert")
    public String convertCurrency(
            @RequestParam("suma") double suma,
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("rate") double rate,
            Model model) {
        
        double convertedAmount;
        String currencySymbol;
        
        if (from.equalsIgnoreCase("RON") && to.equalsIgnoreCase("EUR")) {
            convertedAmount = suma / rate;
            currencySymbol = "EURO";
        } else if (from.equalsIgnoreCase("EUR") && to.equalsIgnoreCase("RON")) {
            convertedAmount = suma * rate;
            currencySymbol = "RON";
        } else {
            model.addAttribute("error", "Conversie neacceptată.");
            return "error";
        }
        
        model.addAttribute("amount", convertedAmount);
        model.addAttribute("currency", currencySymbol);
        
        return "conversionResult";
    }
}
