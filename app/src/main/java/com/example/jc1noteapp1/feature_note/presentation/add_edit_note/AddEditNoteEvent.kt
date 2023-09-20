package com.example.jc1noteapp1.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent{
    data class EnteredTittle(val value:String): AddEditNoteEvent()
    data class ChangeTittleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value:String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}
