package polyglot


class BofhController {
    static defaultAction = 'excuse'


    def excuse = {
        render view: 'show', model: [excuse: ruby.eval('BOFHExcuse.random_excuse')]
    }
}
