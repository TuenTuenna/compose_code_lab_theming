import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val MyShapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)

val MyCardShapes = Shapes(
    small = CutCornerShape(topStart = 10.dp),
    medium = RoundedCornerShape(topStart = 16.dp),
    large = RoundedCornerShape(16.dp)
)
