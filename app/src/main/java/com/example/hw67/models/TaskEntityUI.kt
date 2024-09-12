import com.example.domain.model.TaskEntityModel

data class TaskEntityUI(
    val taskId: Long,
    val taskName: String,
    val description: String,
    val time: Long
)

fun TaskEntityModel.toUi() = TaskEntityUI(taskId, taskName, description, time)

fun TaskEntityUI.fromDomain() = TaskEntityModel(taskId, taskName, description, time)