class BootStrap {

    def init = { servletContext ->
        clj.'create-sample-note'()
    }

    def destroy = {
    }
}
