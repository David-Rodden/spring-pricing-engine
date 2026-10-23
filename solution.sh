#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
key=${1:?usage: ./solution.sh <key> [seal]}
crypt() { openssl enc -aes-256-cbc -pbkdf2 -pass "pass:$key" "$@"; }
if [[ ${2:-} == seal ]]; then tar cz src/main/java/com/example/pricingengine/service/{PricingEngine,DiscountStrategy}.java | crypt -out solution.enc; else crypt -d -in solution.enc | tar xz; fi
