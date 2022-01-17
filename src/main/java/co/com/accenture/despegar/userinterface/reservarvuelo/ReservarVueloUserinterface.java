package co.com.accenture.despegar.userinterface.reservarvuelo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.despegar.com.co/")
public class ReservarVueloUserinterface extends PageObject {

    public static final Target INPUT_CIUDAD_ORIGEN = Target.the("Input para ingresar el origen del vuelo")
            .located(By.xpath("(//input[@class = 'input-tag'])[1]"));

    public static final Target INPUT_CIUDAD_DESTINO = Target.the("Input para ingresar el destino del vuelo")
            .located(By.xpath("(//input[@class = 'input-tag'])[2]"));

    public static final Target OPCION_CIUDAD_ORIGEN = Target.the("Resultado busqueda ciudad origen")
            .located(By.xpath("//li[@class = 'item -active']//span[@class = 'item-text']"));

    public static final Target OPCION_CIUDAD_DESTINO = Target.the("Resultado busqueda ciudad destino")
            .located(By.xpath("(//ul[@class = 'ac-group-items']//span[@class = 'item-text'])[1]"));

    public static final Target CAMPO_FECHA_IDA = Target.the("Campo para desplegar las fechas de ida del vuelo")
            .located(By.xpath("(//input[@class = 'input-tag'])[3]"));

    public static final Target FECHA_IDA = Target.the("Opcion fecha de ida del vuelo")
            .located(By.xpath("(//div[text() = '18'][1])[1]"));

    public static final Target FECHA_VUELTA = Target.the("Opcion fecha de vuelta del vuelo")
            .located(By.xpath("(//div[text() = '20'][1])[2]"));

    public static final Target BOTON_BUSCAR = Target.the("Boton para buscar vuelos segun los filtros ingresados")
            .located(By.xpath("(//button[@class = 'sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg'])[1]"));

    public static final Target BOTON_CERRAR_METODOS_LOGIN = Target.the("Boton para cerrar ventana emergente de metodos de login")
            .located(By.xpath("//i[@class = 'login-incentive--close shifu-3-icon-close -eva-3-mr-md']"));

    public static final Target BOTON_COMPRAR = Target.the("Boton para comprar el vuelo seleccionado")
            .located(By.xpath("(//em[contains(text(), 'Comprar')])[1]"));

    public static final Target BOTON_CONTINUAR = Target.the("Boton para continuar el proceso de compra del vuelo")
            .located(By.xpath("(//em[contains(text(), 'Continuar')])[1]"));

    public static final Target TEXTO_DETALLE_DEL_PAGO = Target.the("Texto para validar que el usuario esta posicionado en la pagina de pago")
            .located(By.xpath("//p[@class = 'chk-pricebox-title-text']"));
}

