# 剪定 sentei — Council as Pruner

Canonical repository: `etzhayyim/actor-sentei`.

The Council's **post-hoc pruning** organ (ADR-2606072000). etzhayyim's organism grows from its root
unstoppably; branches manifest on the append-only Datom log; **sentei prunes** the overgrown /
charter-violating ones *after* they manifest — to keep the organism beautiful (美しく保つ).

Not prior restraint. Actors **self-publish**; sentei cuts back afterward — transparently, signed,
voted, and **reversibly** (`regraft` heals a mistaken cut; the pruned branch's history is never
deleted — 非終末論).

Within the Tamaki artificial organism, sentei is the post-hoc governance
pruning organ. It may propose and append a signed, reversible prune only after
a branch manifests; it cannot impose prior restraint, delete history, halt root
growth, adjudicate guilt, or act without Council/member authority.

- Charter + invariants: [`CLAUDE.md`](./CLAUDE.md)
- Pruning engine: [`src/sentei/methods/prune.cljk`](./src/sentei/methods/prune.cljk) · standalone suite: `kbb --classpath src:test run_tests.cljk`
- Vocab: [`data/pruning-ontology.kotoba.edn`](./data/pruning-ontology.kotoba.edn) ·
  [`lex/com.etzhayyim.sentei.prune.edn`](./lex/com.etzhayyim.sentei.prune.edn)

DID `did:web:etzhayyim.com:actor:sentei`.
