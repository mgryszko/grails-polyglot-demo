package polyglot


class NoteController {
    static defaultAction = 'index'
    
    def index = {
        render view: 'show', model: [notes: Note.list(), mostPopularTags: clj.'n-most-popular-tags'(5)]
    }
    
    def add = {
        def note = new Note(
            content: params.content,
            tags: params.tags.split(',').collect({it.trim()}).toList()
        ).save()
        clj.'note-tagged'(note.tags.join(','))

        redirect action: 'index'
    }
}
