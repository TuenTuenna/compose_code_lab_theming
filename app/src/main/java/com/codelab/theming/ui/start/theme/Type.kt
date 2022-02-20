import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codelab.theming.R

/**
 * https://fonts.google.com/specimen/Montserrat
 */
private val NanumGothic = FontFamily(
    Font(R.font.nanum_gothic_regular),
    Font(R.font.nanum_gothic_bold, FontWeight.W500),
    Font(R.font.nanum_gothic_extrabold, FontWeight.W600)
)

/**
 * https://fonts.google.com/specimen/Domine
 */
private val Bamin = FontFamily(
    Font(R.font.bm_euljiro),
    Font(R.font.bm_hanna_pro, FontWeight.Bold)
)


val MyTypography = Typography(
    h4 = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Bamin,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = NanumGothic,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = NanumGothic,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )
)

