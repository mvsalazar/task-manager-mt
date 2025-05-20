import { createRoute as createRoute_1 } from "@vaadin/hilla-file-router/runtime.js";
import type { AgnosticRoute as AgnosticRoute_1 } from "@vaadin/hilla-file-router/types.js";
import * as Page_1 from "../views/@index.js";
import * as Layout_1 from "../views/@layout.js";
import * as Page_2 from "../views/admin/@index.js";
import * as Page_3 from "../views/admin/add-user.js";
import * as Page_4 from "../views/admin/setup-family.js";
import * as Page_5 from "../views/admin/users.js";
import * as Page_6 from "../views/example.js";
const routes: readonly AgnosticRoute_1[] = [
    createRoute_1("", Layout_1, [
        createRoute_1("", Page_1),
        createRoute_1("admin", [
            createRoute_1("", Page_2),
            createRoute_1("add-user", Page_3),
            createRoute_1("setup-family", Page_4),
            createRoute_1("users", Page_5)
        ]),
        createRoute_1("example", Page_6)
    ])
];
export default routes;
