
import TaskEntityUI
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.InsertUseCase
import fromDomain
import kotlinx.coroutines.launch

class TaskCreateViewModel(
    private val insertUseCase: InsertUseCase
) : ViewModel() {

    fun insertTask(task: TaskEntityUI) {
        viewModelScope.launch {
            val taskEntityModel =
                task.fromDomain()
            insertUseCase(taskEntityModel)
        }
    }
}
