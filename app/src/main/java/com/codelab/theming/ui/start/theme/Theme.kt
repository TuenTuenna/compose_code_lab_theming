import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.codelab.theming.ui.finish.theme.*

private val LightColors = lightColors(
    primary = Green400,
    primaryVariant = Green300,
    onPrimary = Color.White,
    secondary = Green200,
    secondaryVariant = Green300,
    onSecondary = Color.White,
    error = Red800
)

private val DarkColors = darkColors(
    primary = Blue300,
    primaryVariant = Blue400,
    onPrimary = Color.Black,
    secondary = Blue300,
    onSecondary = Color.Black,
    error = Red200
)

@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = MyTypography,
        shapes = MyShapes,
        content = content
    )
}
